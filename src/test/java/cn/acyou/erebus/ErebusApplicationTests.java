package cn.acyou.erebus;

import cn.acyou.erebus.entity.Auditor;
import cn.acyou.erebus.mapper.AuditorMapper;
import cn.acyou.erebus.service.AuditorService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErebusApplicationTests {

    @Autowired
    private AuditorMapper auditorMapper;

    @Autowired
    private AuditorService auditorService;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Auditor> userList = auditorMapper.selectList(null);
        Assert.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }
    @Test
    public void testDeleted() {
        int i = auditorMapper.deleteById(1);
        System.out.println(i);
    }

    @Test
    public void testInsert() {
        List<Auditor> auditors = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Auditor auditor = new Auditor();
            auditor.setName("小明" + i);
            auditor.setDescription("描述信息：xxx");
            auditor.setCreateUser(BigInteger.valueOf(100));
            auditors.add(auditor);
        }
        auditorService.saveBatch(auditors);
    }

    @Test
    public void testUpdate() {
        Auditor auditor = new Auditor();
        auditor.setId(BigInteger.valueOf(10000));
        auditor.setName("小明" + 10000);
        auditor.setDescription("描述信息：小明很贪玩");
        auditor.setCreateUser(BigInteger.valueOf(100));
        auditorService.updateById(auditor);
    }

}
