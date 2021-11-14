package a.demo.server.module.service.impl;

import a.demo.server.module.entity.ArticleUpDown;
import a.demo.server.module.mapper.ArticleUpDownMapper;
import a.demo.server.module.service.IArticleUpDownService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Master Spark
 * @since 2021-09-26
 */
@Service
public class ArticleUpDownServiceImpl extends ServiceImpl<ArticleUpDownMapper, ArticleUpDown> implements IArticleUpDownService {

}
