package cn.shuhui.factory;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class PageFactory {

    // 默认每页数据量
    private static final Integer PAGE_SIZE = 10;

    public static Page getPageData() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        Integer pageNum = Convert.toInt(request.getParameter("pageNum"));
        Integer pageSize = Convert.toInt(request.getParameter("pageSize"));

        return new Page(pageNum, ObjectUtil.isEmpty(pageSize) ? PAGE_SIZE : pageSize);
    }

}
