/*
  	Terra IoT System - A small Virtual Machine and Reactive Language for IoT applications.
  	Copyright (C) 2014-2017  Mauricio Pedro Vieira
	
	This file is part of Terra IoT.
	
	Terra IoT is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    Terra IoT is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with Terra IoT.  If not, see <http://www.gnu.org/licenses/>.  
*/  

#include "stdio.h"
#include "stdarg.h"
#include <android/log.h>

#define LOG_TAG "Native Terra"
#define LOGE(...) __android_log_print (ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

void dbgIx(char* canal, char* format, ...){

	va_list lista;
	va_start(lista,format);

	//vprintf(format,lista);
	//LOGE(format);
	__android_log_vprint(ANDROID_LOG_ERROR, canal, format, lista);
}
