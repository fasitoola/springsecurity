package com.atguigu.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClueRoleController {

    /**
     * 张琪  这个用户 拥有如下权限资源：
     * 线索管理-列表	clue:list
     * 线索管理-录入	clue:add
     * 线索管理-编辑	clue:edit
     * 线索管理-查看	clue:view
     * 线索管理-导入	clue:import
     */
    @RequestMapping(value = "/api/clue_role/index")
    public String clueIndex() {
        return "clueIndex";
    }

    @PreAuthorize(value = "hasRole('saler')")
    @RequestMapping(value = "/api/clue_role/menu")
    public String clueMenu() {
        return "clueMenu";
    }

    @PreAuthorize(value = "hasRole('saler')")
    @RequestMapping(value = "/api/clue_role/menu/child")
    public String clueMenuChild() {
        return "clueMenuChild";
    }

    @PreAuthorize(value = "hasRole('saler')")
    @RequestMapping(value = "/api/clue_role/list")
    public String clueList() {
        return "clueList";
    }

    @PreAuthorize(value = "hasRole('saler')")
    @RequestMapping(value = "/api/clue_role/input")
    public String clueInput() {
        return "clueInput";
    }

    @PreAuthorize(value = "hasRole('saler')")
    @RequestMapping(value = "/api/clue_role/edit")
    public String clueEdit() {
        return "clueEdit";
    }

    @PreAuthorize(value = "hasRole('saler')")
    @RequestMapping(value = "/api/clue_role/view")
    public String clueView() {
        return "clueView";
    }

    @PreAuthorize(value = "hasRole('admin')")
    @RequestMapping(value = "/api/clue_role/del")
    public String clueDel() {
        return "clueDel";
    }

    @PreAuthorize(value = "hasAnyRole('admin', 'manager')") //只要有'admin', 'manager'这两个角色中的任何一个就可以访问
    @RequestMapping(value = "/api/clue_role/export")
    public String clueExport() {
        return "clueExport";
    }
}
