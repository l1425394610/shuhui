package cn.shuhui.handler;

import cn.shuhui.enums.StatusEnum;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 注解填充字段 @TableField(.. fill = FieldFill.INSERT) 生成器策略部分也可以配置！
 *
 * @author luyingjian
 * @date 2023/11/4
 */
@Component
public class MyBatisPlusHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "id", Long.class, IdWorker.getId()); // 起始版本 3.3.0(推荐使用)
        this.strictInsertFill(metaObject, "status", Integer.class, StatusEnum.ENABLED.getCode()); // 起始版本 3.3.0(推荐使用)
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐使用)
        // 或者
        // this.strictInsertFill(metaObject, "createTime", () -> LocalDateTime.now(), LocalDateTime.class); // 起始版本 3.3.3(推荐)
    }


    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐使用)
    }
}
