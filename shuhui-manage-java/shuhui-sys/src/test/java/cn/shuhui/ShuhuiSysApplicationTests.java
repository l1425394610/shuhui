package cn.shuhui;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.hash.Hash;
import cn.hutool.core.util.StrUtil;
import com.alibaba.druid.sql.visitor.functions.Char;
import io.swagger.models.auth.In;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@SpringBootTest
class ShuhuiSysApplicationTests {

    @Test
    void test1() {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }


}
