/*=============================================================================

    Copyright 2009 Nikolay Ognyanov

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

=============================================================================*/

package com.antlr.grammarsv4.xquery;

/**
 * Utility container class for object pairs.
 *
 * @param <F> Type of the first element in the pair.
 * @param <S> Type of the second element in the pair.
 */
public class Pair<F, S>
{
    private F first;
    private S second;

    public Pair(F first, S second)
    {
        this.first = first;
        this.second = second;
    }

    public Pair()
    {
    }

    public F getFirst()
    {
        return first;
    }

    public void setFirst(F first)
    {
        this.first = first;
    }

    public S getSecond()
    {
        return second;
    }

    public void setSecond(S second)
    {
        this.second = second;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }

    @SuppressWarnings("all")
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair other = (Pair) obj;
        if (first == null) {
            if (other.first != null)
                return false;
        }
        else if (!first.equals(other.first))
            return false;
        if (second == null) {
            if (other.second != null)
                return false;
        }
        else if (!second.equals(other.second))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "[" + (first != null ? first.toString() : "null") + ", "
                + (second != null ? second.toString() : "null") + "]";
    }
}