 let usernameRef = document.getElementById("username");
        let passwordRef = document.getElementById("password");
        let eyeL = document.querySelector(".eyeball-l");
        let eyeR = document.querySelector(".eyeball-r");
        let handL = document.querySelector(".hand-l");
        let handR = document.querySelector(".hand-r");

        let normalEyeStyle = () => {
            eyeL.style.cssText = "left: 0.6em; top: 0.6em;";
            eyeR.style.cssText = "right: 0.6em; top: 0.6em;";
        };

        let normalHandStyle = () => {
            handL.style.cssText =
                "height: 2.81em; top: 8.4em; left: 7.5em; transform: rotate(0deg);";
            handR.style.cssText =
                "height: 2.81em; top: 8.4em; right: 7.5em; transform: rotate(0deg);";
        };

        // When clicked on username input
        usernameRef.addEventListener("focus", () => {
            eyeL.style.cssText = "left: 0.75em; top: 1.12em;";
            eyeR.style.cssText = "right: 0.75em; top: 1.12em;";
            normalHandStyle();
        });

        // When clicked on password input
        passwordRef.addEventListener("focus", () => {
            handL.style.cssText =
                "height: 6.56em; top: 3.87em;  transform: rotate(-155deg);";
            handR.style.cssText =
                "height: 6.56em; top: 3.87em;  transform: rotate(155deg);";
            normalEyeStyle();
        });

        const password = document.querySelector("#password");
        const togglePassword = document.querySelector("#togglePassword");
        togglePassword.addEventListener("click", function () {
            // Toggle the type attribute
            const type = password.getAttribute("type") === "text"  ? "password": "text";
            password.setAttribute("type", type);

            // Toggle the icon
            this.classList.toggle("fa-eye-slash");
            this.classList.toggle("fa-eye");

          
        });

        // When clicked outside username and password input
        document.addEventListener("click", (e) => {
            let clickedElem = e.target;
            if (clickedElem != usernameRef && clickedElem != passwordRef) {
                normalEyeStyle();
                normalHandStyle();
            }
        });
