job("First Job") { 
  steps { 
    shell("echo 'First!'") 
  }
}

job("Second Job") { 
  steps { 
    shell("echo 'second :-('") 
  }
}
