package com.WhatToRead.Server.repository;

import com.WhatToRead.Server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
