#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <errno.h>
#include <sys/wait.h>
#include <stdlib.h>

void syst() {
  pid_t fd;
  int x, status;
  // list of commands to be executed, ending with null
  char *argv_list[] = {"whoami", (char*)0};

  // creates two processes - child and parent
  fd = fork(); // assigns the id of child to parent and 0 to child

  // when fd is 0, that means current process is child
  if(fd == 0) {
    printf("Now you are with child process.\n");

    // execv returns only when there is an error
    x = execv("/usr/bin/", argv_list);
    if(x == -1) perror("fork");
  }

  // else parent process is created
  else wait(&status);
}

// In this case, main is the main process
int main(void) {
  syst();
  printf("Now you are with parent process.\n");
  return 0;
}