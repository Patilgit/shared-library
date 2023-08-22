def dockerbuild(){
  script{
    aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 079675111031.dkr.ecr.ap-south-1.amazonaws.com
    docker build -t darshan .
    docker tag darshan:latest 079675111031.dkr.ecr.ap-south-1.amazonaws.com/darshan:latest
    docker push 079675111031.dkr.ecr.ap-south-1.amazonaws.com/darshan:latest
  }
}
    
