package com.java.example.guava;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.PrimitiveSink;
import org.testng.annotations.Test;

/**
 * 布隆过滤器使用
 *
 * @author jingLv
 * @date 2020/11/02
 */
public class BloomFilterTest {

    @Test
    public void bloomFilter() {
        BloomFilter<Integer> bloomFilter = BloomFilter.create(
                // 处理的数据，将任意类型数据转换为Java基础类型，默认转换为byte数组
                (Integer from, PrimitiveSink primitiveSink) -> primitiveSink.putInt(from),
                // 预计插入的元素总数
                10000L,
                // 期望误判率（0.0~1.0）
                0.1
        );

        // 向布隆过滤器中添加元素
        for (int i = 0; i < 10000; i++) {
            bloomFilter.put(i);
        }
        // 检查给定元素是否可能存在在布隆过滤器中
        boolean mightContain = bloomFilter.mightContain(66666);
        System.out.println("是否存在？" + mightContain);
    }
}
