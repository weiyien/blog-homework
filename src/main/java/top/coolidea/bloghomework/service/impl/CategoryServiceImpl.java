package top.coolidea.bloghomework.service.impl;

import top.coolidea.bloghomework.entity.Category;
import top.coolidea.bloghomework.mapper.CategoryMapper;
import top.coolidea.bloghomework.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author weiyien
 * @since 2019-09-08
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
