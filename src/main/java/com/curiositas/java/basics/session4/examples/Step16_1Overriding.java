package com.curiositas.java.basics.session4.examples;

import com.curiositas.java.basics.session4.examples.overriding.*;

import java.util.Arrays;
import java.util.List;

/**
 * In this example we will touch Overriding method and how works interface segregation
 */
public class Step16_1Overriding {
    public static void main(String[] args) {
        var parent = new Parent(SocializationLevel.HIGH);
        var worker = new Worker(SocializationLevel.MIDDLE);
        var outsider = new Outsider();

        // When we need to work only with actors, we can consider each social role as Actor
        List<Actor> actors = Arrays.asList(parent, worker, outsider);
        showHowActorsAct(actors);

        // When we need to work only with roles, we can consider each social role as Role
        List<Role> roles = Arrays.asList(parent, worker, outsider);
        showRolesNames(roles);

        // Here, we use implementation SocialRole that knows all details about Actor and Role classes.
        List<SocialRole> socialRoles = Arrays.asList(parent, worker, outsider);
        showSocialRolesNamesAndActing(socialRoles);
    }
    //todo Подобрать показательный пример, зачем надо работать с интерфейсами, а не с конкретными реализациями
    private static void showHowActorsAct(List<Actor> actors) {
        // An actor can only act(). This method is isolated from the details of implementation these actors
        System.out.println("\nShow acting actors");
        actors.forEach(actor -> System.out.println(actor.act()));
    }

    private static void showRolesNames(List<Role> roles) {
        // A role can only return name. This method is isolated from the details of implementation these roles
        System.out.println("\nShow roles names");
        roles.forEach(actor -> System.out.println("Name: " + actor.getName()));
    }

    private static void showSocialRolesNamesAndActing(List<SocialRole> socialRoles) {
        System.out.println("\nShow all possible details for social name");
        // Here, we can access all methods, specific for Role, Actor and SocialRole
        socialRoles.forEach(actor -> {
            System.out.println("Name: " + actor.getName());
            System.out.println(actor.getSocializationLevel());
            System.out.println(actor.act());
        });
    }
}
