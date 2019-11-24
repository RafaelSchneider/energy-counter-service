package com.zenhomes.repository;


import com.zenhomes.model.Consumption;
import com.zenhomes.model.VillageConsumption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ConsumptionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void postConsumption(@Param("consumption") Consumption consumption) {
        String insert = "INSERT INTO energy_consuptions(id_counter, amount, date_time) " +
                "values (?, ?, ?)";
        entityManager.createNativeQuery(insert)
            .setParameter(1, consumption.getId_counter())
            .setParameter(2, consumption.getAmount())
            .setParameter(3, consumption.getDateTime())
            .executeUpdate();
    }

    public List<VillageConsumption> getConsumptions(){

        String sql = "select village_name, sum(amount) as consuption from  energy_consumptions " +
                " ec, counters c where ec.id_counter = c.id " +
                " group by village_name ";


        List<VillageConsumption> villages =
                jdbcTemplate.query(sql,  (rs, rowNum) ->
                new VillageConsumption(
                        rs.getString("village_name"),
                        rs.getBigDecimal("consuption")
                ));
        return villages;

    }
}
