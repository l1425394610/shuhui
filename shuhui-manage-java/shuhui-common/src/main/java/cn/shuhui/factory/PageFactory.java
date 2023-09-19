package cn.shuhui.factory;

import cn.hutool.Hutool;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.catalina.connector.RequestFacade;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.support.HttpRequestWrapper;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class PageFactory {

    // 默认每页数据量
    private static final Integer PAGE_SIZE = 10;

    public static Page getPageData(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        Integer pageNum = Convert.toInt(request.getParameter("pageNum"));
        Integer pageSize = Convert.toInt(request.getParameter("pageSize"));

        return new Page(pageNum,pageSize == null ? PAGE_SIZE : pageSize);
    }

}
