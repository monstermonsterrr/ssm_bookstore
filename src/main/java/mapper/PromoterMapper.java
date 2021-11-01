package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Promoter;
import pojo.PromoterExample;

public interface PromoterMapper {
    int countByExample(PromoterExample example);

    int deleteByExample(PromoterExample example);

    int deleteByPrimaryKey(Integer promoId);

    int insert(Promoter record);

    int insertSelective(Promoter record);

    List<Promoter> selectByExample(PromoterExample example);

    Promoter selectByPrimaryKey(Integer promoId);

    int updateByExampleSelective(@Param("record") Promoter record, @Param("example") PromoterExample example);

    int updateByExample(@Param("record") Promoter record, @Param("example") PromoterExample example);

    int updateByPrimaryKeySelective(Promoter record);

    int updateByPrimaryKey(Promoter record);
}