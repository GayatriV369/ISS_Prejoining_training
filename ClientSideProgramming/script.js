// DOM Elements
const loginForm = document.getElementById('loginForm');
const registerForm = document.getElementById('registerForm');
const successMessage = document.getElementById('successMessage');
const showRegisterLink = document.getElementById('showRegister');
const showLoginLink = document.getElementById('showLogin');

// Form Elements
const loginFormElement = document.getElementById('loginFormElement');
const registerFormElement = document.getElementById('registerFormElement');

// Validation Constants
const VALIDATION_RULES = {
    username: {
        minLength: 3,
        maxLength: 20,
        pattern: /^[a-zA-Z0-9_]+$/,
        message: 'Username must be 3-20 characters, letters, numbers, and underscores only'
    },
    password: {
        minLength: 6,
        maxLength: 50,
        pattern: /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)/,
        message: 'Password must be 6+ characters with uppercase, lowercase, and number'
    },
    email: {
        pattern: /^[^\s@]+@[^\s@]+\.[^\s@]+$/,
        message: 'Please enter a valid email address'
    }
};

// Switch between forms
showRegisterLink.addEventListener('click', (e) => {
    e.preventDefault();
    switchToForm('register');
});

showLoginLink.addEventListener('click', (e) => {
    e.preventDefault();
    switchToForm('login');
});

function switchToForm(formType) {
    if (formType === 'register') {
        loginForm.classList.remove('active');
        registerForm.classList.add('active');
    } else {
        registerForm.classList.remove('active');
        loginForm.classList.add('active');
    }
    clearAllErrors();
}

// Validation Functions
function validateUsername(username, errorElementId) {
    const errorElement = document.getElementById(errorElementId);
    const input = document.getElementById(errorElementId.replace('Error', ''));
    
    if (!username) {
        showError(errorElement, input, 'Username is required');
        return false;
    }
    
    if (username.length < VALIDATION_RULES.username.minLength || 
        username.length > VALIDATION_RULES.username.maxLength) {
        showError(errorElement, input, `Username must be ${VALIDATION_RULES.username.minLength}-${VALIDATION_RULES.username.maxLength} characters`);
        return false;
    }
    
    if (!VALIDATION_RULES.username.pattern.test(username)) {
        showError(errorElement, input, VALIDATION_RULES.username.message);
        return false;
    }
    
    showSuccess(errorElement, input);
    return true;
}

function validatePassword(password, errorElementId) {
    const errorElement = document.getElementById(errorElementId);
    const input = document.getElementById(errorElementId.replace('Error', ''));
    
    if (!password) {
        showError(errorElement, input, 'Password is required');
        return false;
    }
    
    if (password.length < VALIDATION_RULES.password.minLength) {
        showError(errorElement, input, `Password must be at least ${VALIDATION_RULES.password.minLength} characters`);
        return false;
    }
    
    if (!VALIDATION_RULES.password.pattern.test(password)) {
        showError(errorElement, input, VALIDATION_RULES.password.message);
        return false;
    }
    
    showSuccess(errorElement, input);
    return true;
}

function validateEmail(email, errorElementId) {
    const errorElement = document.getElementById(errorElementId);
    const input = document.getElementById(errorElementId.replace('Error', ''));
    
    if (!email) {
        showError(errorElement, input, 'Email is required');
        return false;
    }
    
    if (!VALIDATION_RULES.email.pattern.test(email)) {
        showError(errorElement, input, VALIDATION_RULES.email.message);
        return false;
    }
    
    showSuccess(errorElement, input);
    return true;
}

function validatePasswordMatch(password, confirmPassword, errorElementId) {
    const errorElement = document.getElementById(errorElementId);
    const input = document.getElementById(errorElementId.replace('Error', ''));
    
    if (!confirmPassword) {
        showError(errorElement, input, 'Please confirm your password');
        return false;
    }
    
    if (password !== confirmPassword) {
        showError(errorElement, input, 'Passwords do not match');
        return false;
    }
    
    showSuccess(errorElement, input);
    return true;
}

// UI Helper Functions
function showError(errorElement, inputElement, message) {
    errorElement.textContent = message;
    inputElement.classList.add('error');
    inputElement.classList.remove('success');
}

function showSuccess(errorElement, inputElement) {
    errorElement.textContent = '';
    inputElement.classList.remove('error');
    inputElement.classList.add('success');
}

function clearAllErrors() {
    const errorElements = document.querySelectorAll('.error-message');
    const inputElements = document.querySelectorAll('input');
    
    errorElements.forEach(element => element.textContent = '');
    inputElements.forEach(element => {
        element.classList.remove('error', 'success');
    });
}

function showLoadingButton(button) {
    button.classList.add('loading');
    button.disabled = true;
}

function hideLoadingButton(button) {
    button.classList.remove('loading');
    button.disabled = false;
}

function showSuccessMessage(message) {
    if (!message) {
        successMessage.classList.add('hidden');
        return;
    }
    document.getElementById('successText').textContent = message;
    loginForm.style.display = 'none';
    registerForm.style.display = 'none';
    successMessage.classList.remove('hidden');
    
    // Auto-hide success message and return to login after 3 seconds
    // setTimeout(() => {
    //     successMessage.classList.add('hidden');
    //     switchToForm('login');
    // }, 3000);
}

// Real-time validation
document.getElementById('loginUsername').addEventListener('input', function() {
    validateUsername(this.value, 'loginUsernameError');
});

document.getElementById('loginPassword').addEventListener('input', function() {
    validatePassword(this.value, 'loginPasswordError');
});

document.getElementById('registerUsername').addEventListener('input', function() {
    validateUsername(this.value, 'registerUsernameError');
});

document.getElementById('registerEmail').addEventListener('input', function() {
    validateEmail(this.value, 'registerEmailError');
});

document.getElementById('registerPassword').addEventListener('input', function() {
    validatePassword(this.value, 'registerPasswordError');
    
    // Also validate confirm password if it has a value
    const confirmPassword = document.getElementById('confirmPassword').value;
    if (confirmPassword) {
        validatePasswordMatch(this.value, confirmPassword, 'confirmPasswordError');
    }
});

document.getElementById('confirmPassword').addEventListener('input', function() {
    const password = document.getElementById('registerPassword').value;
    validatePasswordMatch(password, this.value, 'confirmPasswordError');
});

// Form Submissions
loginFormElement.addEventListener('submit', function(e) {
    e.preventDefault();
    
    const username = document.getElementById('loginUsername').value;
    const password = document.getElementById('loginPassword').value;
    const submitButton = this.querySelector('button[type="submit"]');
    
    // Validate all fields
    const isUsernameValid = validateUsername(username, 'loginUsernameError');
    const isPasswordValid = validatePassword(password, 'loginPasswordError');
    
    if (isUsernameValid && isPasswordValid) {
        showLoadingButton(submitButton);
        
        // Simulate API call
        setTimeout(() => {
            hideLoadingButton(submitButton);
            showSuccessMessage(`Welcome back, ${username}! Login successful.`);
            
            // Clear form
            this.reset();
            clearAllErrors();
        }, 1500);
    }
});

registerFormElement.addEventListener('submit', function(e) {
    e.preventDefault();
    
    const username = document.getElementById('registerUsername').value;
    const email = document.getElementById('registerEmail').value;
    const password = document.getElementById('registerPassword').value;
    const confirmPassword = document.getElementById('confirmPassword').value;
    const submitButton = this.querySelector('button[type="submit"]');
    
    // Validate all fields
    const isUsernameValid = validateUsername(username, 'registerUsernameError');
    const isEmailValid = validateEmail(email, 'registerEmailError');
    const isPasswordValid = validatePassword(password, 'registerPasswordError');
    const isPasswordMatchValid = validatePasswordMatch(password, confirmPassword, 'confirmPasswordError');
    
    if (isUsernameValid && isEmailValid && isPasswordValid && isPasswordMatchValid) {
        showLoadingButton(submitButton);
        
        // Simulate API call
        setTimeout(() => {
            hideLoadingButton(submitButton);
            showSuccessMessage(`Account created successfully for ${username}! Please login.`);
            
            // Clear form
            this.reset();
            clearAllErrors();
        }, 2000);
    }
});

// Initialize
document.addEventListener('DOMContentLoaded', function() {
    // Show login form by default
    switchToForm('login');
});