/*
 * Touch Portal Plugin SDK
 *
 * Copyright 2020 Christophe Carvalho Vilas-Boas
 * christophe.carvalhovilasboas@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.github.ChristopheCVB.TouchPortal.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Data Annotation
 *
 * Target is a Parameter
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.PARAMETER)
public @interface Data {
    /**
     * Data id
     *
     * Default is Field Name
     *
     * @return String id
     */
    String id() default "";

    /**
     * Data label
     *
     * Default is Field Name
     *
     * @return String label
     */
    String label() default "";

    /**
     * Data defaultValue
     *
     * Default is ""
     *
     * @return String defaultValue
     */
    String defaultValue() default "";

    /**
     * Data valueChoices
     *
     * Default is empty Array
     *
     * @return String[] valueChoices
     */
    String[] valueChoices() default {};
}