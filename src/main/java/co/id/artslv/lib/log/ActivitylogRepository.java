/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.log;


import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Irpan Budiana
 */
public interface ActivitylogRepository extends CrudRepository<Activitylog, String> {
}