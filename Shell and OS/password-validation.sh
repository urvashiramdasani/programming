# Author : Urvashi Ramdasani
# Employee ID : 1450
# Linux Training Batch 1
# Aim : Password Validation. Minimum Length should be 8. Must include both alphabet and letter.
# Must contain both capital and small letters

echo "Enter a password : "
read password
length="${#password}"
red=`tput setaf 1`
green=`tput setaf 2`
reset=`tput sgr0`

if test $length -gt 8
then
        echo "$password" | grep -q [0-9]
        if test $? -eq 0
        then
                echo "$password" | grep -q [A-Z]
                if test $? -eq 0
                then
                        echo "$password" | grep -q [a-z]
                        if test $? -eq 0
                        then
                                echo "${green}Strong Password${reset}"
                        else
                                echo "${red}Weak Password${reset}"
                        fi
                else
                        echo "${red}Weak Password${reset}"
                fi
        else
                echo "${red}Weak Password${reset}"
        fi
else
        echo "${red}Weak Password${reset}"
fi
