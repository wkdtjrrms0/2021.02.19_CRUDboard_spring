package mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper //mapper 패키지 하위에 있는 어노테이션이므로 빈으로 등록됨(5)
public interface TestMapper {

    @Select("select name from test.user")
    List<String> select();

    @Insert("insert into test.user values (id, '홍길동', 15, 'male', 11111)")
    void insertyoung();
    @Insert("insert into test.user values (id, '이수근', 31, 'male', 12345)")
    void insertold();

    @Update("update test.user set name = '잼민' where (age < 30)")
    void updateyoung();
    @Update("update test.user set name = '틀딱' where (age >= 30)")
    void updateold();

    @Delete("delete from test.user where (age < 30)")
    void deleteyoung();
    @Delete("delete from test.user where (age >= 30)")
    void deleteold();
}
