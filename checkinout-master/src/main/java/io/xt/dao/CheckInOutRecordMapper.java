package io.xt.dao;

import io.xt.po.CheckInOutRecord;

public interface CheckInOutRecordMapper {
    int insert(CheckInOutRecord record);

    int insertSelective(CheckInOutRecord record);
}