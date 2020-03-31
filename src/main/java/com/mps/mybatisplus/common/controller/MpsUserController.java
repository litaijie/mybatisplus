package com.mps.mybatisplus.common.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mps.mybatisplus.common.entity.MpsUser;
import com.mps.mybatisplus.common.service.IMpsUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 员工信息 前端控制器
 * </p>
 *
 * @author ken
 * @since 2020-03-31
 */
@RestController
@RequestMapping("/common/mps-user")
@Api("员工信息")
public class MpsUserController {
    @Autowired
    private IMpsUserService iMpsUserService;

    /**
     * ba
     * @param mpsUser
     * @return
     */
    @ApiOperation(value = "保存员工信息",notes = "--")
    @PutMapping("/save")
    public boolean save(@RequestBody MpsUser mpsUser){
        if (mpsUser==null){
            return false;
        }

        MpsUser user = null;
        if (StringUtils.isEmpty(mpsUser.getId())){
            user = MpsUser.builder()
                    .name("ltj")
                    .build();
        }else {
            user = mpsUser;
        }
        return iMpsUserService.saveOrUpdate(user);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @ApiOperation(value = "删除员工信息",notes = "--")
    @DeleteMapping("/delete")
    public boolean deleteUser(@RequestParam String id){
        return iMpsUserService.removeById(id);
    }

    /**
     * 查询列表
     * @return
     */
    @ApiOperation(value = "员工信息列表查询",notes = "--")
    @PostMapping("listUser")
    public Page<MpsUser> listUser(){
        Page<MpsUser> mpsUserPage =new Page<>(1,2);

        LambdaQueryWrapper<MpsUser> ltj = new QueryWrapper<MpsUser>().lambda()
                .eq(MpsUser::getName, "ltj");

        return iMpsUserService.page(mpsUserPage, ltj);
    }
}
