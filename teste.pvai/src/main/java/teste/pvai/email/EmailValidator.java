package teste.pvai.email;

public class EmailValidator {
    
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        
        // Verifica se o e-mail contém o símbolo "@"
        if (!email.contains("@")) {
            return false;
        }
        
        // Verifica se o nome de usuário e o domínio não estão vazios
        String[] parts = email.split("@");
        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
            return false;
        }
        
        // Verifica o formato do domínio
        String domain = parts[1];
        String[] domainParts = domain.split("\\.");
        if (domainParts.length < 2) {
            return false;
        }
        
        // Verifica se o nome de domínio possui uma extensão válida
        String extension = domainParts[domainParts.length - 1];
        if (extension.length() < 2 || extension.length() > 4) {
            return false;
        }
        
        return true;
    }
}