/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.List;
import com.promineotech.jeep.entity.Jeep;

/**
 * @author marlo
 *
 */
public interface JeepSalesServices {

  /**
   * @param model
   * @param trim
   * @return
   */
  List<Jeep> fetchJeeps(String model, String trim);

  /**
   * @param model
   * @param trim
   * @return
   */




}
