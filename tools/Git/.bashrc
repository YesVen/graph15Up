#use fix path for SSH_AUTH_SOCK so it works more then one instance of gitbash
export SSH_AUTH_SOCK="$TEMP/ssh_agent_socket"

ps | grep ssh-agent > /dev/null
RUNNING=$?;

if [ "$RUNNING" -eq "1" ] 
then
# ssh-agent is not yet running
    eval `ssh-agent -a $SSH_AUTH_SOCK`
    ssh-add
else
# ssh-agent is already running
    ssh-add 
fi