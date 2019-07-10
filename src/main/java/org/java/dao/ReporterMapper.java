package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Mapper
public interface ReporterMapper {
    public List<Map> getList();
}
