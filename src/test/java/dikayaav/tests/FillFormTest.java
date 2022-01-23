package dikayaav.tests;

import org.junit.jupiter.api.Test;

import static dikayaav.tests.TestData.*;

public class FillFormTest extends TestBase{

    @Test
    void fillRegFormTest () {

        registrationPage.openPage();
        registrationPage
                .typeFirstName(randomFirstName)
                .typeLastName(randomLastName)
                .typeUserEmail(email)
                .selectGenderButton(femaleGender)
                .typePhoneNumber(randomPhoneNumber)
                .calendarComponents.setDate(day, month, year);
        registrationPage.typeSubject(subject)
                .typeHobbie(hobbie)
                .pressUploadPictureButton(picture)
                .typeAddress(randomAddress)
                .pressStateDDList()
                .setStateValue(state)
                .pressCityDDList()
                .setStateValue(city)
                .pressSubmitButton();

       registrationPage.checkResultsValue("Student name", randomFirstName + " " + randomLastName)
                .checkResultsValue("Student Email", email)
                .checkResultsValue("Gender", femaleGender)
                .checkResultsValue("Mobile", randomPhoneNumber)
                .checkResultsValue("Date of Birth", day + " " + month + "," + year)
                .checkResultsValue("Subjects", subject)
                .checkResultsValue("Hobbies", hobbie)
                .checkResultsValue("Picture", "Alukard.png")
                .checkResultsValue("Address", randomAddress)
                .checkResultsValue("State and City", state + " " + city);
    }
}
