package com.littleinn.storytelling.repo;

import com.littleinn.storytelling.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepo extends JpaRepository<Feedback, Long> {
}
