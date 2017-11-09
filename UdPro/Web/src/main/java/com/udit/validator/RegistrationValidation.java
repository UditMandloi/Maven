package com.udit.validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.udit.model.RegistrationDTO;
import com.udit.repository.RegistrationRepository;

@Component
public class RegistrationValidation implements Validator {
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Override
	public boolean supports(Class clazz) {

		return RegistrationDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		RegistrationDTO registrationDTO = (RegistrationDTO) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fname", "error.name.empty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lname", "errors.lname.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "errors.email.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "errors.password.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contact", "errors.contact.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "errors.address.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "errors.city.empty");

		if (registrationDTO.getEmail() != null && registrationDTO.getEmail().trim().length() > 0) {
			if (registrationDTO.getEmail().contains("@") != true) {
				errors.rejectValue("email", "errors.email.@");
			} else if (registrationRepository.findbyEmail(registrationDTO).size() > 0) {

				errors.rejectValue("email", "errors.email.exist");
			} 
		}

	}
}
