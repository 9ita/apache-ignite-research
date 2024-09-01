#!/bin/bash

# Set the path to the Ignite installation directory
IGNITE_HOME="/opt/ignite/apache-ignite"

# Path to the Ignite configuration file
CONFIG_FILE="/opt/ignite/config/ignite-config.xml"

# Check if the configuration file exists
if [ ! -f "$CONFIG_FILE" ]; then
    echo "Ignite configuration file not found: $CONFIG_FILE"
    exit 1
fi

# Start the Ignite node with the specified configuration
$IGNITE_HOME/bin/ignite.sh $CONFIG_FILE
