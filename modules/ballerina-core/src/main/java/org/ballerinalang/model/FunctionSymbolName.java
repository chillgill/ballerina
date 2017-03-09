/*
*  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.model;

/**
 * {@code FunctionSymbolName} represents a package qualified name of a {@link Symbol} in Ballerina.
 *
 * @since 0.8.4
 */
public class FunctionSymbolName extends SymbolName {
    private int noOfParameters;
    private String funcName;

    public FunctionSymbolName(String name, String funcName, String pkgPath, int noOfParameters) {
        super(name, pkgPath);
        this.funcName = funcName;
        this.noOfParameters = noOfParameters;
    }

    public FunctionSymbolName(String name, String funcName, int noOfParameters) {
        super(name);
        this.funcName = funcName;
        this.noOfParameters = noOfParameters;
    }

    public int getNoOfParameters() {
        return noOfParameters;
    }

    public String getFuncName() {
        return funcName;
    }

    public boolean isFunctionsEqual(FunctionSymbolName funcSymName) {
        return this.funcName.equals(funcSymName.getFuncName())
               && (this.getNoOfParameters() == funcSymName.getNoOfParameters());
    }
}
