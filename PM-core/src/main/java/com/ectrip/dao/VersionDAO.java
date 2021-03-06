package com.ectrip.dao;

import com.ectrip.model.Version;
import com.ectrip.vo.VersionVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public interface VersionDAO {

    /**
     * 新增版本
     * @param version
     */
    void saveVersion(Version version);

    /**
     * 主键查询版本
     * @param id
     * @return version
     */
    Version findVersion(@Param("id") Integer id);

    /**
     * 条件查询版本列表
     * @param pageNo
     * @param pageSize
     * @param modleId
     * @return list
     */
    List<VersionVO> queryVersion(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize,
                                 @Param("modleId") Integer modleId);

    Version findVersionUp(@Param("version") String version,@Param("modleId") Integer modleId);
}
