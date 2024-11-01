package rezza.vega;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // Beispiel 1: Standard GET-Request
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "Willkommen auf der Startseite!";
    }

    // Beispiel 2: Ein anderer Endpunkt mit POST-Request
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public String submit() {
        return "Formular wurde erfolgreich abgesendet!";
    }

    // Beispiel 3: GET-Request mit einem Pfad
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public String info() {
        return "Dies ist die Info-Seite.";
    }

    // Beispiel 4: GET-Request mit Parameter
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    @ResponseBody
    public String greet() {
        return "Hallo, willkommen zu unserem Service!";
    }
}

/*
Erläuterung:
1. **@Controller**: Diese Annotation markiert die Klasse als Spring MVC Controller, der Webanfragen verarbeitet.
2. **@RequestMapping**: Diese Annotation wird verwendet, um HTTP-Anfragen einem bestimmten URL-Pfad und einer bestimmten Methode zuzuordnen.
   - **value = "/"**: Der Pfad der URL, die angesprochen werden soll (z. B. "/" für die Startseite).
   - **method = RequestMethod.GET**: Gibt an, dass nur GET-Anfragen verarbeitet werden sollen.
3. **@ResponseBody**: Gibt an, dass der Rückgabewert der Methode direkt als HTTP-Antwort an den Client gesendet wird.

In diesem Beispiel gibt es vier Endpunkte:
- **"/"**: Gibt eine Nachricht für die Startseite zurück.
- **"/submit"**: Bearbeitet eine POST-Anfrage und gibt eine Nachricht zurück.
- **"/info"**: Gibt eine Nachricht für die Info-Seite zurück.
- **"/greet"**: Gibt eine Begrüßungsnachricht für den Benutzer zurück.
*/

