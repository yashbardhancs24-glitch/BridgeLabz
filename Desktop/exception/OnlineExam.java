import java.time.LocalDateTime;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String message) {
        super(message);
    }
}
class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

class ExamSubmission {
    private static final LocalDateTime DEADLINE = LocalDateTime.of(2025, 12, 31, 23, 59);

    public void submitExam(String fileName, LocalDateTime submissionTime) 
            throws LateSubmissionException, InvalidFileFormatException {
        
        if (!fileName.toLowerCase().endsWith(".pdf")) {
            throw new InvalidFileFormatException("File type must be .pdf.");
        }
        
        if (submissionTime.isAfter(DEADLINE)) {
            throw new LateSubmissionException("Submission is past the deadline: " + DEADLINE);
        }

        System.out.println("Exam submitted successfully: " + fileName);
    }
}

public class OnlineExam {
    public static void main(String[] args) {
        ExamSubmission system = new ExamSubmission();
        
        String lateFile = "essay.docx";
        LocalDateTime lateTime = LocalDateTime.of(2026, 1, 1, 0, 0);

        try {
            system.submitExam(lateFile, lateTime);
        } catch (LateSubmissionException e) {
            System.err.println("Submission failed: late submission.");
        } catch (InvalidFileFormatException e) {
            System.err.println("Submission failed: invalid file format.");
        }
    }
}