package com.groupeisi.controller;


import com.groupeisi.service.AppRolesService;
import com.groupeisi.domaine.Roles;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/roles")
@AllArgsConstructor
public class AppRolesController {
    private AppRolesService appRolesService;

    @GetMapping
    public List<Roles> getAppRoles() {
        return appRolesService.getAppRoles();
    }

    @GetMapping("/{id}")
    public Roles getAppRoles(@PathVariable("id") int id) {
        return appRolesService.getAppRole(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Roles createAppRoles(@Valid @RequestBody Roles appRoles) {
        return appRolesService.createAppRoles(appRoles);
    }

    @PutMapping("/{id}")
    public Roles updateAppRoles(@PathVariable("id") int id, @Valid @RequestBody Roles appRoles) {
        return appRolesService.updateAppRoles(id, appRoles);
    }

    @DeleteMapping("/{id}")
    public void deleteAppRoles(@PathVariable("id") int id) {
        appRolesService.deleteAppRoles(id);
    }
}

