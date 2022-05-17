const express = require('express');
const startUp_Debugger = require('debug')('startupDebugger')
const dbDebugger = require('debug')('dbDebugger')

const app = express();

startUp_Debugger('Connected to server')
dbDebugger('connected to database')


// do this in the cli (set DEBUG=startUp_Debugger,dbDebugger) or (set DEBUG=*)
// you can debug and run app at the same time => startUp_Debugger nodemon index.js