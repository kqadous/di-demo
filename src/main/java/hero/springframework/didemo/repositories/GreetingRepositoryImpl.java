package hero.springframework.didemo.repositories;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getArabicGreeting() {
        return "السلام عليكم ورحمة الله";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hi - Primary greeting service";
    }

    @Override
    public String getIndianGreeting() {
        return "नमस्ते - प्राथमिक ग्रीटिंग सेवा";
    }
}
