package com.earth.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.earth.entity.Skill;
import com.earth.service.ISkillService;
import com.xweb.common.utils.PageUtil;
import com.xweb.common.web.response.RespPageResult;
import com.xweb.common.web.response.RespResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhx
 * @since 2024-09-04
 */
@RestController
@RequestMapping("/skills")
@AllArgsConstructor
public class SkillController {

    private ISkillService skillService;

    @GetMapping("/users/{user_id}")
    public RespPageResult<Skill> listSkillByUserId(@PathVariable("user_id") String userId) {
        QueryWrapper<Skill> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Skill::getUserId, userId);
        return RespPageResult.builder().data(PageUtil.buildResult(skillService.list(queryWrapper))).build();
    }

    @PutMapping("/users/{user_id}")
    public RespResult<Skill> updateSkill(@RequestBody Skill skill) {
        QueryWrapper<Skill> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Skill::getUserId, skill.getUserId());
        queryWrapper.lambda().eq(Skill::getSort, skill.getSort());
        List<Skill> list = skillService.list(queryWrapper);
        if (list.size() > 0) {
            skillService.update(skill, queryWrapper);
        } else {
            skillService.save(skill);
        }
        return RespResult.builder().build();
    }
}

