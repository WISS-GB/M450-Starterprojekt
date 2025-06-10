# FROM maven:3.8.2-jdk-8 # for Java 8
FROM node:23-alpine

WORKDIR /starter-project
COPY src/front-end/public /starter-project/public
COPY src/front-end/src /starter-project/src
COPY src/front-end/package.json /starter-project/

RUN npm install

CMD npm run dev