package com.sam.book.feedback;

import com.sam.book.common.PageResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("feedback")
@RequiredArgsConstructor
@Tag(name="Feedback")
public class FeedBackController {
    private final FeedbackService feedbackService;


    @PostMapping
    public ResponseEntity<Integer> saveFeedback(
            @Valid @RequestBody FeedbackRequest request,
            Authentication connectedUser
    ) {
        return ResponseEntity.ok(feedbackService.save(request, connectedUser));
    }

    @GetMapping
    public ResponseEntity<PageResponse<FeedbackResponse>> findAllFeedbackByBook (
        @PathVariable("book-id") Integer bookId,
        @RequestParam(name="page", defaultValue = "0",required = false ) int page,
        @RequestParam(name="size", defaultValue = "0", required = false) int size,
        Authentication connectedUser
    ) {
        return ResponseEntity.ok(feedbackService.findAllFeedbackByBook(bookId,page,size,connectedUser));
    }



}
