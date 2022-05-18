package com.bouncingballsite.repository;

import com.bouncingballsite.model.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

    @Repository
    public class ImagesRepo {
        @Autowired
        private JdbcTemplate template;

        public Images fetchCounts() {
            String sql = "SELECT id, name, url FROM images";
            RowMapper<Images> rowMapper = new BeanPropertyRowMapper<>(Images.class);
            return template.queryForObject(sql, rowMapper);
        }
}
