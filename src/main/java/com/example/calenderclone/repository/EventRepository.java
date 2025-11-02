package com.example.calenderclone.repository;

import com.example.calenderclone.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {}
