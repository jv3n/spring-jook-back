#!/bin/bash

# Displaying a message
echo "Executing shell script from Maven..."

# Installing npm dependencies
echo "Installing npm dependencies..."
npm install

# Building the application
echo "Building and package api swagger module."
npm run build
