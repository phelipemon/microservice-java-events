package dev.phelipemon.events_microservice.repositories;


import dev.phelipemon.events_microservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}