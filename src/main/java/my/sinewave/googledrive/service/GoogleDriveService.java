package my.sinewave.googledrive.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class GoogleDriveService {

    public String getContent(String fileName) throws IOException {
        return Files.readString(Path.of(fileName));
    }
}
