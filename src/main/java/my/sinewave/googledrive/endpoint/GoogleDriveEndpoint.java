package my.sinewave.googledrive.endpoint;

import lombok.RequiredArgsConstructor;
import my.sinewave.googledrive.service.GoogleDriveService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
public class GoogleDriveEndpoint {

    private final GoogleDriveService googleDriveService;

    @GetMapping("/{filename}")
    public ContentResponse getContent(@PathVariable String filename) throws IOException {
        String content = googleDriveService.getContent(filename);
        return new ContentResponse(content);
    }

}
