package com.dhcc.ict.manage.loginandregister.dao;

import com.dhcc.ict.manage.loginandregister.pojo.Certificate;
import com.dhcc.ict.manage.loginandregister.pojo.CertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificateMapper {
    int countByExample(CertificateExample example);

    int deleteByExample(CertificateExample example);

    int deleteByPrimaryKey(Integer certificateId);

    int insert(Certificate record);

    int insertSelective(Certificate record);

    List<Certificate> selectByExampleWithBLOBs(CertificateExample example);

    List<Certificate> selectByExample(CertificateExample example);

    Certificate selectByPrimaryKey(Integer certificateId);

    int updateByExampleSelective(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByExampleWithBLOBs(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByExample(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByPrimaryKeySelective(Certificate record);

    int updateByPrimaryKeyWithBLOBs(Certificate record);

    int updateByPrimaryKey(Certificate record);
}