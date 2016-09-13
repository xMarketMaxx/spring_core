package com.theater.service;

import com.theater.domain.Auditorium;

import java.util.List;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public interface AuditoriumService {
    List<Auditorium> getAll();
    Auditorium getByName();
}
