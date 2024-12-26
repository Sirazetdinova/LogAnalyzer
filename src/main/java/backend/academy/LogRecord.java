package backend.academy;

import java.time.LocalDate;

public record LogRecord(String remoteAddr, LocalDate date, String requestPath, int status, long bodyBytesSent) {
}
