package com.Hackathon.hackathonteam14.repositories;

import com.Hackathon.hackathonteam14.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
